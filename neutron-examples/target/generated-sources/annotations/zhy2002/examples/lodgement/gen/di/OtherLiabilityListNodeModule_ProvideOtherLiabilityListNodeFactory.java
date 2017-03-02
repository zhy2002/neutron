package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeModule_ProvideOtherLiabilityListNodeFactory
    implements Factory<OtherLiabilityListNode> {
  private final OtherLiabilityListNodeModule module;

  public OtherLiabilityListNodeModule_ProvideOtherLiabilityListNodeFactory(
      OtherLiabilityListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityListNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityListNode> create(OtherLiabilityListNodeModule module) {
    return new OtherLiabilityListNodeModule_ProvideOtherLiabilityListNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityListNodeModule#provideOtherLiabilityListNode()}. */
  public static OtherLiabilityListNode proxyProvideOtherLiabilityListNode(
      OtherLiabilityListNodeModule instance) {
    return instance.provideOtherLiabilityListNode();
  }
}
