package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SettlementDateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettlementDateNodeModule_ProvideSettlementDateNodeFactory
    implements Factory<SettlementDateNode> {
  private final SettlementDateNodeModule module;

  public SettlementDateNodeModule_ProvideSettlementDateNodeFactory(
      SettlementDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SettlementDateNode get() {
    return Preconditions.checkNotNull(
        module.provideSettlementDateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SettlementDateNode> create(SettlementDateNodeModule module) {
    return new SettlementDateNodeModule_ProvideSettlementDateNodeFactory(module);
  }

  /** Proxies {@link SettlementDateNodeModule#provideSettlementDateNode()}. */
  public static SettlementDateNode proxyProvideSettlementDateNode(
      SettlementDateNodeModule instance) {
    return instance.provideSettlementDateNode();
  }
}
