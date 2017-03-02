package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredEmploymentNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final RetiredEmploymentNodeModule module;

  public RetiredEmploymentNodeModule_ProvideObjectUiNodeFactory(
      RetiredEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(RetiredEmploymentNodeModule module) {
    return new RetiredEmploymentNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link RetiredEmploymentNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(RetiredEmploymentNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
