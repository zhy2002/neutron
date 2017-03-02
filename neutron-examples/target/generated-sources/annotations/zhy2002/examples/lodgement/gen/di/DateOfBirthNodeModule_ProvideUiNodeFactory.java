package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DateOfBirthNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final DateOfBirthNodeModule module;

  public DateOfBirthNodeModule_ProvideUiNodeFactory(DateOfBirthNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(DateOfBirthNodeModule module) {
    return new DateOfBirthNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link DateOfBirthNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(DateOfBirthNodeModule instance) {
    return instance.provideUiNode();
  }
}
