package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PreviousEmploymentNodeModule module;

  public PreviousEmploymentNodeModule_ProvideObjectUiNodeFactory(
      PreviousEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PreviousEmploymentNodeModule module) {
    return new PreviousEmploymentNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PreviousEmploymentNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
