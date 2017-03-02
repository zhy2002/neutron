package zhy2002.examples.di;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MySubClass_Factory implements Factory<MySubClass> {
  private static final MySubClass_Factory INSTANCE = new MySubClass_Factory();

  @Override
  public MySubClass get() {
    return new MySubClass();
  }

  public static Factory<MySubClass> create() {
    return INSTANCE;
  }
}
