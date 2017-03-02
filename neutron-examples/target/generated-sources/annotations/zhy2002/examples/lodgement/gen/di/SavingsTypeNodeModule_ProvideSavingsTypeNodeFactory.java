package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsTypeNodeModule_ProvideSavingsTypeNodeFactory
    implements Factory<SavingsTypeNode> {
  private final SavingsTypeNodeModule module;

  public SavingsTypeNodeModule_ProvideSavingsTypeNodeFactory(SavingsTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsTypeNode> create(SavingsTypeNodeModule module) {
    return new SavingsTypeNodeModule_ProvideSavingsTypeNodeFactory(module);
  }

  /** Proxies {@link SavingsTypeNodeModule#provideSavingsTypeNode()}. */
  public static SavingsTypeNode proxyProvideSavingsTypeNode(SavingsTypeNodeModule instance) {
    return instance.provideSavingsTypeNode();
  }
}
