package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployedNodeChildProvider_MembersInjector
    implements MembersInjector<EmployedNodeChildProvider> {
  private final MembersInjector<EmployerNameNode> employerNameNodeInjectorMembersInjector;

  private final MembersInjector<EmployerAddressNode> employerAddressNodeInjectorMembersInjector;

  private final MembersInjector<OccupationNode> occupationNodeInjectorMembersInjector;

  private final MembersInjector<EmployerPhoneNode> employerPhoneNodeInjectorMembersInjector;

  private final MembersInjector<EmploymentStatusNode> employmentStatusNodeInjectorMembersInjector;

  private final MembersInjector<EmploymentStartedNode> employmentStartedNodeInjectorMembersInjector;

  private final MembersInjector<EmploymentEndedNode> employmentEndedNodeInjectorMembersInjector;

  public EmployedNodeChildProvider_MembersInjector(
      MembersInjector<EmployerNameNode> employerNameNodeInjectorMembersInjector,
      MembersInjector<EmployerAddressNode> employerAddressNodeInjectorMembersInjector,
      MembersInjector<OccupationNode> occupationNodeInjectorMembersInjector,
      MembersInjector<EmployerPhoneNode> employerPhoneNodeInjectorMembersInjector,
      MembersInjector<EmploymentStatusNode> employmentStatusNodeInjectorMembersInjector,
      MembersInjector<EmploymentStartedNode> employmentStartedNodeInjectorMembersInjector,
      MembersInjector<EmploymentEndedNode> employmentEndedNodeInjectorMembersInjector) {
    assert employerNameNodeInjectorMembersInjector != null;
    this.employerNameNodeInjectorMembersInjector = employerNameNodeInjectorMembersInjector;
    assert employerAddressNodeInjectorMembersInjector != null;
    this.employerAddressNodeInjectorMembersInjector = employerAddressNodeInjectorMembersInjector;
    assert occupationNodeInjectorMembersInjector != null;
    this.occupationNodeInjectorMembersInjector = occupationNodeInjectorMembersInjector;
    assert employerPhoneNodeInjectorMembersInjector != null;
    this.employerPhoneNodeInjectorMembersInjector = employerPhoneNodeInjectorMembersInjector;
    assert employmentStatusNodeInjectorMembersInjector != null;
    this.employmentStatusNodeInjectorMembersInjector = employmentStatusNodeInjectorMembersInjector;
    assert employmentStartedNodeInjectorMembersInjector != null;
    this.employmentStartedNodeInjectorMembersInjector =
        employmentStartedNodeInjectorMembersInjector;
    assert employmentEndedNodeInjectorMembersInjector != null;
    this.employmentEndedNodeInjectorMembersInjector = employmentEndedNodeInjectorMembersInjector;
  }

  public static MembersInjector<EmployedNodeChildProvider> create(
      MembersInjector<EmployerNameNode> employerNameNodeInjectorMembersInjector,
      MembersInjector<EmployerAddressNode> employerAddressNodeInjectorMembersInjector,
      MembersInjector<OccupationNode> occupationNodeInjectorMembersInjector,
      MembersInjector<EmployerPhoneNode> employerPhoneNodeInjectorMembersInjector,
      MembersInjector<EmploymentStatusNode> employmentStatusNodeInjectorMembersInjector,
      MembersInjector<EmploymentStartedNode> employmentStartedNodeInjectorMembersInjector,
      MembersInjector<EmploymentEndedNode> employmentEndedNodeInjectorMembersInjector) {
    return new EmployedNodeChildProvider_MembersInjector(
        employerNameNodeInjectorMembersInjector,
        employerAddressNodeInjectorMembersInjector,
        occupationNodeInjectorMembersInjector,
        employerPhoneNodeInjectorMembersInjector,
        employmentStatusNodeInjectorMembersInjector,
        employmentStartedNodeInjectorMembersInjector,
        employmentEndedNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(EmployedNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.employerNameNodeInjector = employerNameNodeInjectorMembersInjector;
    instance.employerAddressNodeInjector = employerAddressNodeInjectorMembersInjector;
    instance.occupationNodeInjector = occupationNodeInjectorMembersInjector;
    instance.employerPhoneNodeInjector = employerPhoneNodeInjectorMembersInjector;
    instance.employmentStatusNodeInjector = employmentStatusNodeInjectorMembersInjector;
    instance.employmentStartedNodeInjector = employmentStartedNodeInjectorMembersInjector;
    instance.employmentEndedNodeInjector = employmentEndedNodeInjectorMembersInjector;
  }

  public static void injectEmployerNameNodeInjector(
      EmployedNodeChildProvider instance,
      MembersInjector<EmployerNameNode> employerNameNodeInjector) {
    instance.employerNameNodeInjector = employerNameNodeInjector;
  }

  public static void injectEmployerAddressNodeInjector(
      EmployedNodeChildProvider instance,
      MembersInjector<EmployerAddressNode> employerAddressNodeInjector) {
    instance.employerAddressNodeInjector = employerAddressNodeInjector;
  }

  public static void injectOccupationNodeInjector(
      EmployedNodeChildProvider instance, MembersInjector<OccupationNode> occupationNodeInjector) {
    instance.occupationNodeInjector = occupationNodeInjector;
  }

  public static void injectEmployerPhoneNodeInjector(
      EmployedNodeChildProvider instance,
      MembersInjector<EmployerPhoneNode> employerPhoneNodeInjector) {
    instance.employerPhoneNodeInjector = employerPhoneNodeInjector;
  }

  public static void injectEmploymentStatusNodeInjector(
      EmployedNodeChildProvider instance,
      MembersInjector<EmploymentStatusNode> employmentStatusNodeInjector) {
    instance.employmentStatusNodeInjector = employmentStatusNodeInjector;
  }

  public static void injectEmploymentStartedNodeInjector(
      EmployedNodeChildProvider instance,
      MembersInjector<EmploymentStartedNode> employmentStartedNodeInjector) {
    instance.employmentStartedNodeInjector = employmentStartedNodeInjector;
  }

  public static void injectEmploymentEndedNodeInjector(
      EmployedNodeChildProvider instance,
      MembersInjector<EmploymentEndedNode> employmentEndedNodeInjector) {
    instance.employmentEndedNodeInjector = employmentEndedNodeInjector;
  }
}
