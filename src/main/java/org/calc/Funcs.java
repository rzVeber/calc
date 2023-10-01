package org.calc;

public class Funcs {
    public static float sum(float a, float b){ // +
        return a+b;
    }

    public static float sub(float a, float b){ // -
        return a-b;
    }
    public static float mul(float a, float b){ // *
        return a*b;
    }
    public static float div(float a, float b){ // /
        float c;
        if(a==0.0f && b==0.0f){ //если первое число ноль то деление невозможно, представлено минимально возможным числом (нулем)
            return 0;
        } else if(a!=0.0f && b==0.0f){ //если происходит деление на ноль выходит бесконечность, её представить невозможно и заменяется ближайшим лимитом
            return Float.MAX_VALUE;
        }
        c=a/b;
        return c;
    }
}
