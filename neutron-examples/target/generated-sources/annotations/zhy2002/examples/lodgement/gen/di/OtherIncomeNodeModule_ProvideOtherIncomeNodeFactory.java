package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherIncomeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNodeModule_ProvideOtherIncomeNodeFactory
    implements Factory<OtherIncomeNode> {
  private final OtherIncomeNodeModule module;

  public OtherIncomeNodeModule_ProvideOtherIncomeNodeFactory(OtherIncomeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherIncomeNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherIncomeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherIncomeNode> create(OtherIncomeNodeModule module) {
    return new OtherIncomeNodeModule_ProvideOtherIncomeNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeNodeModule#provideOtherIncomeNode()}. */
  public static OtherIncomeNode proxyProvideOtherIncomeNode(OtherIncomeNodeModule instance) {
    return instance.provideOtherIncomeNode();
  }
}
