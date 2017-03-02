package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ApplicantReferenceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicantReferenceNodeModule_ProvideApplicantReferenceNodeFactory
    implements Factory<ApplicantReferenceNode> {
  private final ApplicantReferenceNodeModule module;

  public ApplicantReferenceNodeModule_ProvideApplicantReferenceNodeFactory(
      ApplicantReferenceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ApplicantReferenceNode get() {
    return Preconditions.checkNotNull(
        module.provideApplicantReferenceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApplicantReferenceNode> create(ApplicantReferenceNodeModule module) {
    return new ApplicantReferenceNodeModule_ProvideApplicantReferenceNodeFactory(module);
  }

  /** Proxies {@link ApplicantReferenceNodeModule#provideApplicantReferenceNode()}. */
  public static ApplicantReferenceNode proxyProvideApplicantReferenceNode(
      ApplicantReferenceNodeModule instance) {
    return instance.provideApplicantReferenceNode();
  }
}
