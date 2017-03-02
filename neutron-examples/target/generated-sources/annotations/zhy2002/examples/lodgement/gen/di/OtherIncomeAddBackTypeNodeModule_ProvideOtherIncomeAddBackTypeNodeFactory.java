package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherIncomeAddBackTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAddBackTypeNodeModule_ProvideOtherIncomeAddBackTypeNodeFactory
    implements Factory<OtherIncomeAddBackTypeNode> {
  private final OtherIncomeAddBackTypeNodeModule module;

  public OtherIncomeAddBackTypeNodeModule_ProvideOtherIncomeAddBackTypeNodeFactory(
      OtherIncomeAddBackTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherIncomeAddBackTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherIncomeAddBackTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherIncomeAddBackTypeNode> create(
      OtherIncomeAddBackTypeNodeModule module) {
    return new OtherIncomeAddBackTypeNodeModule_ProvideOtherIncomeAddBackTypeNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeAddBackTypeNodeModule#provideOtherIncomeAddBackTypeNode()}. */
  public static OtherIncomeAddBackTypeNode proxyProvideOtherIncomeAddBackTypeNode(
      OtherIncomeAddBackTypeNodeModule instance) {
    return instance.provideOtherIncomeAddBackTypeNode();
  }
}
