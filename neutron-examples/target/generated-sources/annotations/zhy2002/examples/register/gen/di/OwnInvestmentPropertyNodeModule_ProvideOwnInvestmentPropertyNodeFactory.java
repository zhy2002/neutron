package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.OwnInvestmentPropertyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnInvestmentPropertyNodeModule_ProvideOwnInvestmentPropertyNodeFactory
    implements Factory<OwnInvestmentPropertyNode> {
  private final OwnInvestmentPropertyNodeModule module;

  public OwnInvestmentPropertyNodeModule_ProvideOwnInvestmentPropertyNodeFactory(
      OwnInvestmentPropertyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OwnInvestmentPropertyNode get() {
    return Preconditions.checkNotNull(
        module.provideOwnInvestmentPropertyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OwnInvestmentPropertyNode> create(OwnInvestmentPropertyNodeModule module) {
    return new OwnInvestmentPropertyNodeModule_ProvideOwnInvestmentPropertyNodeFactory(module);
  }

  /** Proxies {@link OwnInvestmentPropertyNodeModule#provideOwnInvestmentPropertyNode()}. */
  public static OwnInvestmentPropertyNode proxyProvideOwnInvestmentPropertyNode(
      OwnInvestmentPropertyNodeModule instance) {
    return instance.provideOwnInvestmentPropertyNode();
  }
}
