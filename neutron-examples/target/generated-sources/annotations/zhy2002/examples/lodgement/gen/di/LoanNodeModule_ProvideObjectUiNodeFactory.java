package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNodeModule_ProvideObjectUiNodeFactory implements Factory<ObjectUiNode<?>> {
  private final LoanNodeModule module;

  public LoanNodeModule_ProvideObjectUiNodeFactory(LoanNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(LoanNodeModule module) {
    return new LoanNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link LoanNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(LoanNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
