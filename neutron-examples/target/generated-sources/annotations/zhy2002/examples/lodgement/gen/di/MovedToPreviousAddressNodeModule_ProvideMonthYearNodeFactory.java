package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final MovedToPreviousAddressNodeModule module;

  public MovedToPreviousAddressNodeModule_ProvideMonthYearNodeFactory(
      MovedToPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(MovedToPreviousAddressNodeModule module) {
    return new MovedToPreviousAddressNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link MovedToPreviousAddressNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(
      MovedToPreviousAddressNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
