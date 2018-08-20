package com.example.library;

public class HogeFuga {
    private HogeFuga hogefuga;

    public void hogefuga() {
        assert false;
        System.out.println(hogefuga != null ? hogefuga.toString() : null);
    }

    public enum Type {
        HOGE, FUGA;

        @Override
        public String toString() {
            switch (this) {
                case HOGE:
                    return "hogeeee!!";
                case FUGA:
                    return "fugaaaa!!";
                default:
                    return null;
            }
        }
    }
}
