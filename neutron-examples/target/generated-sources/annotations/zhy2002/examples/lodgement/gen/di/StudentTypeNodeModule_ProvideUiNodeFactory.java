package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final StudentTypeNodeModule module;

  public StudentTypeNodeModule_ProvideUiNodeFactory(StudentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(StudentTypeNodeModule module) {
    return new StudentTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link StudentTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(StudentTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
