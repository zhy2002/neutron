package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubmissionNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SubmissionNodeModule module;

  public SubmissionNodeModule_ProvideParentUiNodeFactory(SubmissionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SubmissionNodeModule module) {
    return new SubmissionNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SubmissionNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SubmissionNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
