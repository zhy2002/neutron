package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredEmploymentNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final RetiredEmploymentNodeModule module;

  public RetiredEmploymentNodeModule_ProvideParentUiNodeFactory(
      RetiredEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(RetiredEmploymentNodeModule module) {
    return new RetiredEmploymentNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link RetiredEmploymentNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(RetiredEmploymentNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
