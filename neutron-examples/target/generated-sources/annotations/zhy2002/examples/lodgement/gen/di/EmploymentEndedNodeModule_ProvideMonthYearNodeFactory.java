package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final EmploymentEndedNodeModule module;

  public EmploymentEndedNodeModule_ProvideMonthYearNodeFactory(EmploymentEndedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(EmploymentEndedNodeModule module) {
    return new EmploymentEndedNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link EmploymentEndedNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(EmploymentEndedNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
