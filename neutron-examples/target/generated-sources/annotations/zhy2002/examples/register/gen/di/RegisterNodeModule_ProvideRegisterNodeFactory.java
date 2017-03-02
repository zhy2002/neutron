package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.RegisterNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeModule_ProvideRegisterNodeFactory implements Factory<RegisterNode> {
  private final RegisterNodeModule module;

  public RegisterNodeModule_ProvideRegisterNodeFactory(RegisterNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RegisterNode get() {
    return Preconditions.checkNotNull(
        module.provideRegisterNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RegisterNode> create(RegisterNodeModule module) {
    return new RegisterNodeModule_ProvideRegisterNodeFactory(module);
  }

  /** Proxies {@link RegisterNodeModule#provideRegisterNode()}. */
  public static RegisterNode proxyProvideRegisterNode(RegisterNodeModule instance) {
    return instance.provideRegisterNode();
  }
}
