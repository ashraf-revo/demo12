package com.example

class DemoApplication {

    static void main(String[] args) {

    }
}

class Statement {
    List<Statement> statements = []
}

class IF extends Statement {
    Expression expression
}

class While extends Statement {
    Expression expression
}

class Expression {
    Token left
    Comparator Comparator
    Token right
}

enum Comparator {
    G, GE, L, LE, E, NE
}
class Token extends Statement{
    Type type
    String name
}
enum Type{
    Num,Bool
}
class DefineStatement extends Statement{
    Token token
    String value
}

enum Operator{
    Plus,Minus,Mul,Div
}
class BasicStatement extends Statement{
    Statement left
    Operator operation
    Statement right
    Statement to
}
