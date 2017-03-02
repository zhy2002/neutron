package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertyWeeklyRentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyWeeklyRentNodeModule_ProvidePropertyWeeklyRentNodeFactory
    implements Factory<PropertyWeeklyRentNode> {
  private final PropertyWeeklyRentNodeModule module;

  public PropertyWeeklyRentNodeModule_ProvidePropertyWeeklyRentNodeFactory(
      PropertyWeeklyRentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyWeeklyRentNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyWeeklyRentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyWeeklyRentNode> create(PropertyWeeklyRentNodeModule module) {
    return new PropertyWeeklyRentNodeModule_ProvidePropertyWeeklyRentNodeFactory(module);
  }

  /** Proxies {@link PropertyWeeklyRentNodeModule#providePropertyWeeklyRentNode()}. */
  public static PropertyWeeklyRentNode proxyProvidePropertyWeeklyRentNode(
      PropertyWeeklyRentNodeModule instance) {
    return instance.providePropertyWeeklyRentNode();
  }
}
