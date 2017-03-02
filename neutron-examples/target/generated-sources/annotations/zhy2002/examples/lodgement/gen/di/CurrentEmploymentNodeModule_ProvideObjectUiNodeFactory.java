package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final CurrentEmploymentNodeModule module;

  public CurrentEmploymentNodeModule_ProvideObjectUiNodeFactory(
      CurrentEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(CurrentEmploymentNodeModule module) {
    return new CurrentEmploymentNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(CurrentEmploymentNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
