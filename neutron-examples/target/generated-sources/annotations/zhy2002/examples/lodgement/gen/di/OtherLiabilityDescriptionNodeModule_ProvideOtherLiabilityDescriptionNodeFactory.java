package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityDescriptionNodeModule_ProvideOtherLiabilityDescriptionNodeFactory
    implements Factory<OtherLiabilityDescriptionNode> {
  private final OtherLiabilityDescriptionNodeModule module;

  public OtherLiabilityDescriptionNodeModule_ProvideOtherLiabilityDescriptionNodeFactory(
      OtherLiabilityDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityDescriptionNode> create(
      OtherLiabilityDescriptionNodeModule module) {
    return new OtherLiabilityDescriptionNodeModule_ProvideOtherLiabilityDescriptionNodeFactory(
        module);
  }

  /** Proxies {@link OtherLiabilityDescriptionNodeModule#provideOtherLiabilityDescriptionNode()}. */
  public static OtherLiabilityDescriptionNode proxyProvideOtherLiabilityDescriptionNode(
      OtherLiabilityDescriptionNodeModule instance) {
    return instance.provideOtherLiabilityDescriptionNode();
  }
}
