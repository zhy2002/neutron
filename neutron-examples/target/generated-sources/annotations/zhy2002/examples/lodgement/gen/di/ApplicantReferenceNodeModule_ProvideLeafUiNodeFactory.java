package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicantReferenceNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ApplicantReferenceNodeModule module;

  public ApplicantReferenceNodeModule_ProvideLeafUiNodeFactory(
      ApplicantReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ApplicantReferenceNodeModule module) {
    return new ApplicantReferenceNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ApplicantReferenceNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ApplicantReferenceNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}