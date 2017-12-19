package com.csci.grammar; // Java Package generated by the BNF Converter.

import com.csci.visitor.Visitable;
import com.csci.visitor.Visitor;

public class EPlus extends Exp implements Visitable {

    public Exp exp_1, exp_2;

    public EPlus(Exp p1, Exp p2) {
        exp_1 = p1;
        exp_2 = p2;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
