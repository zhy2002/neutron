package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RealEstateListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateListNodeModule_ProvideRealEstateListNodeFactory
    implements Factory<RealEstateListNode> {
  private final RealEstateListNodeModule module;

  public RealEstateListNodeModule_ProvideRealEstateListNodeFactory(
      RealEstateListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RealEstateListNode get() {
    return Preconditions.checkNotNull(
        module.provideRealEstateListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RealEstateListNode> create(RealEstateListNodeModule module) {
    return new RealEstateListNodeModule_ProvideRealEstateListNodeFactory(module);
  }

  /** Proxies {@link RealEstateListNodeModule#provideRealEstateListNode()}. */
  public static RealEstateListNode proxyProvideRealEstateListNode(
      RealEstateListNodeModule instance) {
    return instance.provideRealEstateListNode();
  }
}
