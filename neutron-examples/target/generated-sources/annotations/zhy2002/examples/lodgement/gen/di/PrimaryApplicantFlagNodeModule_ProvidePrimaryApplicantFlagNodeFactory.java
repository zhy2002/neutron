package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PrimaryApplicantFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimaryApplicantFlagNodeModule_ProvidePrimaryApplicantFlagNodeFactory
    implements Factory<PrimaryApplicantFlagNode> {
  private final PrimaryApplicantFlagNodeModule module;

  public PrimaryApplicantFlagNodeModule_ProvidePrimaryApplicantFlagNodeFactory(
      PrimaryApplicantFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PrimaryApplicantFlagNode get() {
    return Preconditions.checkNotNull(
        module.providePrimaryApplicantFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PrimaryApplicantFlagNode> create(PrimaryApplicantFlagNodeModule module) {
    return new PrimaryApplicantFlagNodeModule_ProvidePrimaryApplicantFlagNodeFactory(module);
  }

  /** Proxies {@link PrimaryApplicantFlagNodeModule#providePrimaryApplicantFlagNode()}. */
  public static PrimaryApplicantFlagNode proxyProvidePrimaryApplicantFlagNode(
      PrimaryApplicantFlagNodeModule instance) {
    return instance.providePrimaryApplicantFlagNode();
  }
}
