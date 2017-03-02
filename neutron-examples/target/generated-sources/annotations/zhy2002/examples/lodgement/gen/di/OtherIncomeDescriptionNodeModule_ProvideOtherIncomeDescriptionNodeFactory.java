package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherIncomeDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeDescriptionNodeModule_ProvideOtherIncomeDescriptionNodeFactory
    implements Factory<OtherIncomeDescriptionNode> {
  private final OtherIncomeDescriptionNodeModule module;

  public OtherIncomeDescriptionNodeModule_ProvideOtherIncomeDescriptionNodeFactory(
      OtherIncomeDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherIncomeDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherIncomeDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherIncomeDescriptionNode> create(
      OtherIncomeDescriptionNodeModule module) {
    return new OtherIncomeDescriptionNodeModule_ProvideOtherIncomeDescriptionNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeDescriptionNodeModule#provideOtherIncomeDescriptionNode()}. */
  public static OtherIncomeDescriptionNode proxyProvideOtherIncomeDescriptionNode(
      OtherIncomeDescriptionNodeModule instance) {
    return instance.provideOtherIncomeDescriptionNode();
  }
}
