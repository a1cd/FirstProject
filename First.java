/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: First.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/08/30 at 02:56 PM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

import java.net.*;

public class First {
    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        print("Hello World!");
        for (String word : args) {
            print(word);
        }
    }
}
