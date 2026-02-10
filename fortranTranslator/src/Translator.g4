grammar Translator;

axioma : (H1 | H2 | H3 | H4 | H5 | H6 | BOLD | ITAL | LINE | BLOCKQUOTE | LN | TEXT | LINKOK | LINKERR | CODEBLOCK |LISTA)+;


LISTA: ('- ' CONTENT '\n')+ {
    String completo = getText();
    String[] lineas = completo.split("\n");
    if (lineas.length > 1)
        System.out.println("<UL>");
    else
         System.out.print("<UL>");
    for (String linea : lineas) {
        if (!linea.trim().isEmpty()) {
            String contenido = linea.substring(2).trim();
            if (lineas.length > 1)
                System.out.println("<LI>" + contenido + "</LI>");
            else
                 System.out.print("<LI>" + contenido + "</LI>");
        }
    }
    System.out.print("</UL>");
    System.out.println("");
};

CODEBLOCK: '~~~' ( ~'~' | '~~' ~'~' | '~' ~'~' )* '~~~' {
    System.out.print("<code> <pre>" + getText().substring(3, getText().length() - 3) + "</pre> </code>");
};

LINKOK: '[' CONTENT ']' '(' ('http://' | 'https://') [a-zA-Z0-9]+ ('.' [a-zA-Z0-9]+)+ ')' {
    String str = getText();
    int corcheteCierre = str.indexOf(']');
    int parentesisApertura = str.indexOf('(');
    String texto = str.substring(1, corcheteCierre);
    String url = str.substring(parentesisApertura + 1, str.length() - 1);
    // Cambiado println por print para evitar el doble salto de línea
    System.out.print("<A HREF=\"" + url + "\">" + texto + "</A>");
};

LINKERR: '[' CONTENT ']' '(' LNCONTENT ')' {
    String str = getText();
    int corcheteCierre = str.indexOf(']');
    int parentesisApertura = str.indexOf('(');
    String texto = str.substring(1, corcheteCierre);
    String url = str.substring(parentesisApertura + 1, str.length() - 1);
    System.out.print("<A HREF=\"" + url + "\">" + texto + " (URL enlace aparentemente incorrecta)</A>");
};

H1: '# ' CONTENT '\n' {System.out.println("<H1>" + getText().substring(1).trim() + "</H1>");};
H2: '## ' CONTENT '\n' {System.out.println("<H2>" + getText().substring(2).trim() + "</H2>");};
H3: '### ' CONTENT '\n' {System.out.println("<H3>" + getText().substring(3).trim() + "</H3>");};
H4: '#### ' CONTENT '\n' {System.out.println("<H4>" + getText().substring(4).trim() + "</H4>");};
H5: '##### ' CONTENT '\n' {System.out.println("<H5>" + getText().substring(5).trim() + "</H5>");};
H6: '###### ' CONTENT '\n' {System.out.println("<H6>" + getText().substring(6).trim() + "</H6>");};
BLOCKQUOTE: '> ' CONTENT '\n' {System.out.println("<blockquote>" + getText().substring(1).trim() + "</blockquote>");};
LINE: ('***'|'---'|'___') {System.out.print("<HR/>");};
TEXT: CONTENT {System.out.print(getText());};
BOLD: ('**' CONTENT '**' | '__' CONTENT '__') {System.out.print("<SPAN class=\"bold\">" + getText().substring(2, getText().length() - 2) + "</SPAN>");};
ITAL: ('*' CONTENT '*' | '_' CONTENT '_') {System.out.print("<SPAN class=\"ital\">" + getText().substring(1, getText().length() - 1) + "</SPAN>");};
LN: '\n' {System.out.println();};

fragment
CONTENT: ([a-zA-Z0-9 \t])+;
LNCONTENT: (~[)\r\n])+;