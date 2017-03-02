package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNodeModule_ProvideOtherLiabilityNodeFactory
    implements Factory<OtherLiabilityNode> {
  private final OtherLiabilityNodeModule module;

  public OtherLiabilityNodeModule_ProvideOtherLiabilityNodeFactory(
      OtherLiabilityNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityNode> create(OtherLiabilityNodeModule module) {
    return new OtherLiabilityNodeModule_ProvideOtherLiabilityNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityNodeModule#provideOtherLiabilityNode()}. */
  public static OtherLiabilityNode proxyProvideOtherLiabilityNode(
      OtherLiabilityNodeModule instance) {
    return instance.provideOtherLiabilityNode();
  }
}
