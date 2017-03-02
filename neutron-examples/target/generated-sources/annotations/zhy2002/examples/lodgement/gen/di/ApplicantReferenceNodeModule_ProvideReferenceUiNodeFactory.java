package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.ReferenceUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicantReferenceNodeModule_ProvideReferenceUiNodeFactory
    implements Factory<ReferenceUiNode<?>> {
  private final ApplicantReferenceNodeModule module;

  public ApplicantReferenceNodeModule_ProvideReferenceUiNodeFactory(
      ApplicantReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ReferenceUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideReferenceUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ReferenceUiNode<?>> create(ApplicantReferenceNodeModule module) {
    return new ApplicantReferenceNodeModule_ProvideReferenceUiNodeFactory(module);
  }

  /** Proxies {@link ApplicantReferenceNodeModule#provideReferenceUiNode()}. */
  public static ReferenceUiNode<?> proxyProvideReferenceUiNode(
      ApplicantReferenceNodeModule instance) {
    return instance.provideReferenceUiNode();
  }
}
