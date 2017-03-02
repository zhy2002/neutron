package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ApprovalInPrincipleFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApprovalInPrincipleFlagNodeModule_ProvideApprovalInPrincipleFlagNodeFactory
    implements Factory<ApprovalInPrincipleFlagNode> {
  private final ApprovalInPrincipleFlagNodeModule module;

  public ApprovalInPrincipleFlagNodeModule_ProvideApprovalInPrincipleFlagNodeFactory(
      ApprovalInPrincipleFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ApprovalInPrincipleFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideApprovalInPrincipleFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApprovalInPrincipleFlagNode> create(
      ApprovalInPrincipleFlagNodeModule module) {
    return new ApprovalInPrincipleFlagNodeModule_ProvideApprovalInPrincipleFlagNodeFactory(module);
  }

  /** Proxies {@link ApprovalInPrincipleFlagNodeModule#provideApprovalInPrincipleFlagNode()}. */
  public static ApprovalInPrincipleFlagNode proxyProvideApprovalInPrincipleFlagNode(
      ApprovalInPrincipleFlagNodeModule instance) {
    return instance.provideApprovalInPrincipleFlagNode();
  }
}
