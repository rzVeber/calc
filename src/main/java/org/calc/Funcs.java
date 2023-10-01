package org.calc;

public class Funcs {
    public static float sum(int a, int b){ // +
        return (float)a+(float)b;
    }
    public static float sum(float a, float b){ // +
        return (float)a+(float)b;
    }
    public static float sub(int a, int b){ // -
        return (float)a-(float)b;
    }
    public static float sub(float a, float b){ // -
        return (float)a-(float)b;
    }
    public static float mul(int a, int b){ // *
        return (float)a*(float)b;
    }
    public static float mul(float a, float b){ // *
        return (float)a*(float)b;
    }
    public static float div(int a, int b){ // /
        float c;
        if(a==0 && b==0){
            return 0;
        } else if(a!=0 || b==0) {
            return Float.MAX_VALUE;
        }
        c=a/b;
        return c;
    }
    public static float div(float a, float b){ // /
        float c;
        if(a==0.0f && b==0.0f){
            return 0;
        } else if(a!=0.0f && b==0.0f){
            return Float.MAX_VALUE;
        }
        c=a/b;
        return c;
    }
}
