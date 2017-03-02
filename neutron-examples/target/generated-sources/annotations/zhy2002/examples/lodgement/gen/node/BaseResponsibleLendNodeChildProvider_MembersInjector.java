package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseResponsibleLendNodeChildProvider_MembersInjector
    implements MembersInjector<BaseResponsibleLendNodeChildProvider> {
  private final MembersInjector<ResponsibleTypeOfChangeNode>
      responsibleTypeOfChangeNodeInjectorMembersInjector;

  private final MembersInjector<ResponsibleMitigationMethodNode>
      responsibleMitigationMethodNodeInjectorMembersInjector;

  private final MembersInjector<ResponsibleSignificantChangeFlagNode>
      responsibleSignificantChangeFlagNodeInjectorMembersInjector;

  private final MembersInjector<ResponsibleRepaymentDifficultyNode>
      responsibleRepaymentDifficultyNodeInjectorMembersInjector;

  public BaseResponsibleLendNodeChildProvider_MembersInjector(
      MembersInjector<ResponsibleTypeOfChangeNode>
          responsibleTypeOfChangeNodeInjectorMembersInjector,
      MembersInjector<ResponsibleMitigationMethodNode>
          responsibleMitigationMethodNodeInjectorMembersInjector,
      MembersInjector<ResponsibleSignificantChangeFlagNode>
          responsibleSignificantChangeFlagNodeInjectorMembersInjector,
      MembersInjector<ResponsibleRepaymentDifficultyNode>
          responsibleRepaymentDifficultyNodeInjectorMembersInjector) {
    assert responsibleTypeOfChangeNodeInjectorMembersInjector != null;
    this.responsibleTypeOfChangeNodeInjectorMembersInjector =
        responsibleTypeOfChangeNodeInjectorMembersInjector;
    assert responsibleMitigationMethodNodeInjectorMembersInjector != null;
    this.responsibleMitigationMethodNodeInjectorMembersInjector =
        responsibleMitigationMethodNodeInjectorMembersInjector;
    assert responsibleSignificantChangeFlagNodeInjectorMembersInjector != null;
    this.responsibleSignificantChangeFlagNodeInjectorMembersInjector =
        responsibleSignificantChangeFlagNodeInjectorMembersInjector;
    assert responsibleRepaymentDifficultyNodeInjectorMembersInjector != null;
    this.responsibleRepaymentDifficultyNodeInjectorMembersInjector =
        responsibleRepaymentDifficultyNodeInjectorMembersInjector;
  }

  public static MembersInjector<BaseResponsibleLendNodeChildProvider> create(
      MembersInjector<ResponsibleTypeOfChangeNode>
          responsibleTypeOfChangeNodeInjectorMembersInjector,
      MembersInjector<ResponsibleMitigationMethodNode>
          responsibleMitigationMethodNodeInjectorMembersInjector,
      MembersInjector<ResponsibleSignificantChangeFlagNode>
          responsibleSignificantChangeFlagNodeInjectorMembersInjector,
      MembersInjector<ResponsibleRepaymentDifficultyNode>
          responsibleRepaymentDifficultyNodeInjectorMembersInjector) {
    return new BaseResponsibleLendNodeChildProvider_MembersInjector(
        responsibleTypeOfChangeNodeInjectorMembersInjector,
        responsibleMitigationMethodNodeInjectorMembersInjector,
        responsibleSignificantChangeFlagNodeInjectorMembersInjector,
        responsibleRepaymentDifficultyNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(BaseResponsibleLendNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.responsibleTypeOfChangeNodeInjector =
        responsibleTypeOfChangeNodeInjectorMembersInjector;
    instance.responsibleMitigationMethodNodeInjector =
        responsibleMitigationMethodNodeInjectorMembersInjector;
    instance.responsibleSignificantChangeFlagNodeInjector =
        responsibleSignificantChangeFlagNodeInjectorMembersInjector;
    instance.responsibleRepaymentDifficultyNodeInjector =
        responsibleRepaymentDifficultyNodeInjectorMembersInjector;
  }

  public static void injectResponsibleTypeOfChangeNodeInjector(
      BaseResponsibleLendNodeChildProvider instance,
      MembersInjector<ResponsibleTypeOfChangeNode> responsibleTypeOfChangeNodeInjector) {
    instance.responsibleTypeOfChangeNodeInjector = responsibleTypeOfChangeNodeInjector;
  }

  public static void injectResponsibleMitigationMethodNodeInjector(
      BaseResponsibleLendNodeChildProvider instance,
      MembersInjector<ResponsibleMitigationMethodNode> responsibleMitigationMethodNodeInjector) {
    instance.responsibleMitigationMethodNodeInjector = responsibleMitigationMethodNodeInjector;
  }

  public static void injectResponsibleSignificantChangeFlagNodeInjector(
      BaseResponsibleLendNodeChildProvider instance,
      MembersInjector<ResponsibleSignificantChangeFlagNode>
          responsibleSignificantChangeFlagNodeInjector) {
    instance.responsibleSignificantChangeFlagNodeInjector =
        responsibleSignificantChangeFlagNodeInjector;
  }

  public static void injectResponsibleRepaymentDifficultyNodeInjector(
      BaseResponsibleLendNodeChildProvider instance,
      MembersInjector<ResponsibleRepaymentDifficultyNode>
          responsibleRepaymentDifficultyNodeInjector) {
    instance.responsibleRepaymentDifficultyNodeInjector =
        responsibleRepaymentDifficultyNodeInjector;
  }
}
