package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PhoneInfoFieldNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNodeModule_ProvidePhoneInfoFieldNodeFactory
    implements Factory<PhoneInfoFieldNode> {
  private final AreaCodeNodeModule module;

  public AreaCodeNodeModule_ProvidePhoneInfoFieldNodeFactory(AreaCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PhoneInfoFieldNode get() {
    return Preconditions.checkNotNull(
        module.providePhoneInfoFieldNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PhoneInfoFieldNode> create(AreaCodeNodeModule module) {
    return new AreaCodeNodeModule_ProvidePhoneInfoFieldNodeFactory(module);
  }

  /** Proxies {@link AreaCodeNodeModule#providePhoneInfoFieldNode()}. */
  public static PhoneInfoFieldNode proxyProvidePhoneInfoFieldNode(AreaCodeNodeModule instance) {
    return instance.providePhoneInfoFieldNode();
  }
}
