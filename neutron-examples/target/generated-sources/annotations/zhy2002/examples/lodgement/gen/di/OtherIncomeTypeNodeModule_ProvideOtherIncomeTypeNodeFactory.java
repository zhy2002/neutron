package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherIncomeTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeTypeNodeModule_ProvideOtherIncomeTypeNodeFactory
    implements Factory<OtherIncomeTypeNode> {
  private final OtherIncomeTypeNodeModule module;

  public OtherIncomeTypeNodeModule_ProvideOtherIncomeTypeNodeFactory(
      OtherIncomeTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherIncomeTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherIncomeTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherIncomeTypeNode> create(OtherIncomeTypeNodeModule module) {
    return new OtherIncomeTypeNodeModule_ProvideOtherIncomeTypeNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeTypeNodeModule#provideOtherIncomeTypeNode()}. */
  public static OtherIncomeTypeNode proxyProvideOtherIncomeTypeNode(
      OtherIncomeTypeNodeModule instance) {
    return instance.provideOtherIncomeTypeNode();
  }
}
