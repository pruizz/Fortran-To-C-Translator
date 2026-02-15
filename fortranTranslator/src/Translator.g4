grammar Translator;

axioma : (IDENT | NUM_INT_CONST | NUM_REAL_CONST | COMMENT | PROGRAM | END | LN)+;
PROGRAM   : 'PROGRAM' ;
END       : 'END' ;
INTERFACE : 'INTERFACE' ;
SUBROUTINE: 'SUBROUTINE' ;
FUNCTION  : 'FUNCTION' ;
INTEGER   : 'INTEGER' ;
REAL      : 'REAL' ;
CHARACTER : 'CHARACTER' ;
PARAMETER : 'PARAMETER' ;
INTENT : 'INTENT' ;
IN : 'IN' ;
OUT : 'OUT' ;
INOUT : 'INOUT' ;
CALL : 'CALL' ;

STRING_CONST: ('\'' (~[\r\n])* '\'' | '"' (~[\r\n])* '"') {System.out.print(getText());};
IDENT : [a-zA-Z] [a-zA-Z0-9_]* {System.out.print(getText());};
NUM_REAL_CONST: '-'? ([0-9]+'.'[0-9]+ | [0-9]+ [eE] '-'? [0-9]+ | [0-9]+'.'[0-9]+[eE]'-'?[0-9]+) {System.out.print(getText());};
NUM_INT_CONST: '-'? [0-9]+ {System.out.print(getText());};
COMMENT: '!' ~[\r\n]* {System.out.print("//" + getText().substring(1));};
LN : ('\r' | '\n' | '\r\n')+ {System.out.println("");};
WS : [ \t\f]+ -> skip; //para no tener errores con espacios y tal

