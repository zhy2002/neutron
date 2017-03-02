package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomePreviousYearNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherIncomePreviousYearNodeModule module;

  public OtherIncomePreviousYearNodeModule_ProvideLeafUiNodeFactory(
      OtherIncomePreviousYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherIncomePreviousYearNodeModule module) {
    return new OtherIncomePreviousYearNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomePreviousYearNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      OtherIncomePreviousYearNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
