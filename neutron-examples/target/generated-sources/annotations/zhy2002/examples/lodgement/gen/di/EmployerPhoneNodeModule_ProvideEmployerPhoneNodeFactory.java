package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmployerPhoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerPhoneNodeModule_ProvideEmployerPhoneNodeFactory
    implements Factory<EmployerPhoneNode> {
  private final EmployerPhoneNodeModule module;

  public EmployerPhoneNodeModule_ProvideEmployerPhoneNodeFactory(EmployerPhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmployerPhoneNode get() {
    return Preconditions.checkNotNull(
        module.provideEmployerPhoneNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmployerPhoneNode> create(EmployerPhoneNodeModule module) {
    return new EmployerPhoneNodeModule_ProvideEmployerPhoneNodeFactory(module);
  }

  /** Proxies {@link EmployerPhoneNodeModule#provideEmployerPhoneNode()}. */
  public static EmployerPhoneNode proxyProvideEmployerPhoneNode(EmployerPhoneNodeModule instance) {
    return instance.provideEmployerPhoneNode();
  }
}
