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
    String value
}
enum Type{
    Num,Bool
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
