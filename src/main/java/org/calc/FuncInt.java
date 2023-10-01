package org.calc;

public class FuncInt extends FuncFloat {
    public static float sum(int a, int b){ // +
        return sum((float)a,(float)b);
    }
    public static float sub(int a, int b){ // -
        return sub((float)a,(float)b);
    }
    public static float mul(int a, int b){ // *
        return mul((float)a,(float)b);
    }
    public static float div(int a, int b){ // /
        return div((float)a, (float)b);
    }
}
