package com.craftinginterpreters.jlox;
import java.util.List;

public interface LoxCallable {
  Object call(Interpreter interpreter, List<Object> arguments);
}
