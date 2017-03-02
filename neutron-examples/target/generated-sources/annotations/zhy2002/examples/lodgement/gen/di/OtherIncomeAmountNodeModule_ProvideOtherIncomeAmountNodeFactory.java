package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherIncomeAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAmountNodeModule_ProvideOtherIncomeAmountNodeFactory
    implements Factory<OtherIncomeAmountNode> {
  private final OtherIncomeAmountNodeModule module;

  public OtherIncomeAmountNodeModule_ProvideOtherIncomeAmountNodeFactory(
      OtherIncomeAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherIncomeAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherIncomeAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherIncomeAmountNode> create(OtherIncomeAmountNodeModule module) {
    return new OtherIncomeAmountNodeModule_ProvideOtherIncomeAmountNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeAmountNodeModule#provideOtherIncomeAmountNode()}. */
  public static OtherIncomeAmountNode proxyProvideOtherIncomeAmountNode(
      OtherIncomeAmountNodeModule instance) {
    return instance.provideOtherIncomeAmountNode();
  }
}
