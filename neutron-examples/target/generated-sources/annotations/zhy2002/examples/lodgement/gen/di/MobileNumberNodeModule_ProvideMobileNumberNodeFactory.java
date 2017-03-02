package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MobileNumberNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MobileNumberNodeModule_ProvideMobileNumberNodeFactory
    implements Factory<MobileNumberNode> {
  private final MobileNumberNodeModule module;

  public MobileNumberNodeModule_ProvideMobileNumberNodeFactory(MobileNumberNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MobileNumberNode get() {
    return Preconditions.checkNotNull(
        module.provideMobileNumberNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MobileNumberNode> create(MobileNumberNodeModule module) {
    return new MobileNumberNodeModule_ProvideMobileNumberNodeFactory(module);
  }

  /** Proxies {@link MobileNumberNodeModule#provideMobileNumberNode()}. */
  public static MobileNumberNode proxyProvideMobileNumberNode(MobileNumberNodeModule instance) {
    return instance.provideMobileNumberNode();
  }
}
