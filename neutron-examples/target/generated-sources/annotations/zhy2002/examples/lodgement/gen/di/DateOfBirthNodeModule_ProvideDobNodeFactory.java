package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.DobNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DateOfBirthNodeModule_ProvideDobNodeFactory implements Factory<DobNode<?>> {
  private final DateOfBirthNodeModule module;

  public DateOfBirthNodeModule_ProvideDobNodeFactory(DateOfBirthNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DobNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideDobNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DobNode<?>> create(DateOfBirthNodeModule module) {
    return new DateOfBirthNodeModule_ProvideDobNodeFactory(module);
  }

  /** Proxies {@link DateOfBirthNodeModule#provideDobNode()}. */
  public static DobNode<?> proxyProvideDobNode(DateOfBirthNodeModule instance) {
    return instance.provideDobNode();
  }
}
