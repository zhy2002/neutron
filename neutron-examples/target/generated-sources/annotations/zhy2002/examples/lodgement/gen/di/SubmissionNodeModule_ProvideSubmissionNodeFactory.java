package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SubmissionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubmissionNodeModule_ProvideSubmissionNodeFactory
    implements Factory<SubmissionNode> {
  private final SubmissionNodeModule module;

  public SubmissionNodeModule_ProvideSubmissionNodeFactory(SubmissionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SubmissionNode get() {
    return Preconditions.checkNotNull(
        module.provideSubmissionNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SubmissionNode> create(SubmissionNodeModule module) {
    return new SubmissionNodeModule_ProvideSubmissionNodeFactory(module);
  }

  /** Proxies {@link SubmissionNodeModule#provideSubmissionNode()}. */
  public static SubmissionNode proxyProvideSubmissionNode(SubmissionNodeModule instance) {
    return instance.provideSubmissionNode();
  }
}
