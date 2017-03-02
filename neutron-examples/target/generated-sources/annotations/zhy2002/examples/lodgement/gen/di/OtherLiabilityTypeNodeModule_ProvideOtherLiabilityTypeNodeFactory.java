package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityTypeNodeModule_ProvideOtherLiabilityTypeNodeFactory
    implements Factory<OtherLiabilityTypeNode> {
  private final OtherLiabilityTypeNodeModule module;

  public OtherLiabilityTypeNodeModule_ProvideOtherLiabilityTypeNodeFactory(
      OtherLiabilityTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityTypeNode> create(OtherLiabilityTypeNodeModule module) {
    return new OtherLiabilityTypeNodeModule_ProvideOtherLiabilityTypeNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityTypeNodeModule#provideOtherLiabilityTypeNode()}. */
  public static OtherLiabilityTypeNode proxyProvideOtherLiabilityTypeNode(
      OtherLiabilityTypeNodeModule instance) {
    return instance.provideOtherLiabilityTypeNode();
  }
}
