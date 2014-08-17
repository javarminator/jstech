//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.03 at 02:04:24 PM CEST 
//


package af.jstech.migration.jaxb.scheduler;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import af.jstech.migration.jaxb.scheduler.Environment.Variable;
import af.jstech.migration.jaxb.scheduler.HttpAuthentication.HttpUsers;
import af.jstech.migration.jaxb.scheduler.HttpAuthentication.HttpUsers.HttpUser;
import af.jstech.migration.jaxb.scheduler.Job.DelayAfterError;
import af.jstech.migration.jaxb.scheduler.Job.DelayOrderAfterSetback;
import af.jstech.migration.jaxb.scheduler.Job.Description;
import af.jstech.migration.jaxb.scheduler.Job.LockUse;
import af.jstech.migration.jaxb.scheduler.Job.Monitor;
import af.jstech.migration.jaxb.scheduler.Job.Process;
import af.jstech.migration.jaxb.scheduler.Job.StartWhenDirectoryChanged;
import af.jstech.migration.jaxb.scheduler.JobChain.FileOrderSink;
import af.jstech.migration.jaxb.scheduler.JobChain.FileOrderSource;
import af.jstech.migration.jaxb.scheduler.JobChain.JobChainNode;
import af.jstech.migration.jaxb.scheduler.Monthdays.Weekday;
import af.jstech.migration.jaxb.scheduler.Order.Payload;
import af.jstech.migration.jaxb.scheduler.Params.CopyParams;
import af.jstech.migration.jaxb.scheduler.Plugin.PluginConfig;
import af.jstech.migration.jaxb.scheduler.RegisterRemoteScheduler.ERROR;
import af.jstech.migration.jaxb.scheduler.RunTime.At;
import af.jstech.migration.jaxb.scheduler.RunTime.Date;
import af.jstech.migration.jaxb.scheduler.RunTime.Month;
import af.jstech.migration.jaxb.scheduler.Security.AllowedHost;
import af.jstech.migration.jaxb.scheduler.ServiceRequest.Content;
import af.jstech.migration.jaxb.scheduler.Spooler.Answer;
import af.jstech.migration.jaxb.scheduler.Spooler.Config;
import af.jstech.migration.jaxb.scheduler.Spooler.Config.Base;
import af.jstech.migration.jaxb.scheduler.Spooler.Config.Locks;
import af.jstech.migration.jaxb.scheduler.Spooler.Config.Schedules;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.scheduler.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShowState_QNAME = new QName("", "show_state");
    private final static QName _ScheduleRemove_QNAME = new QName("", "schedule.remove");
    private final static QName _CheckFolders_QNAME = new QName("", "check_folders");
    private final static QName _SubsystemShow_QNAME = new QName("", "subsystem.show");
    private final static QName _SchedulerLogLogCategoriesShow_QNAME = new QName("", "scheduler_log.log_categories.show");
    private final static QName _Commands_QNAME = new QName("", "commands");
    private final static QName _Lock_QNAME = new QName("", "lock");
    private final static QName _ParamsGet_QNAME = new QName("", "params.get");
    private final static QName _AddOrder_QNAME = new QName("", "add_order");
    private final static QName _LockRemove_QNAME = new QName("", "lock.remove");
    private final static QName _Schedule_QNAME = new QName("", "schedule");
    private final static QName _S_QNAME = new QName("", "s");
    private final static QName _Order_QNAME = new QName("", "order");
    private final static QName _ProcessClass_QNAME = new QName("", "process_class");
    private final static QName _ShowSchedulers_QNAME = new QName("", "show_schedulers");
    private final static QName _ModifyHotFolder_QNAME = new QName("", "modify_hot_folder");
    private final static QName _ProcessClassRemove_QNAME = new QName("", "process_class.remove");
    private final static QName _RunTime_QNAME = new QName("", "run_time");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.scheduler.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Monthdays }
     * 
     */
    public Monthdays createMonthdays() {
        return new Monthdays();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createServiceRequestContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link CopyParams }
     * 
     */
    public CopyParams createParamsCopyParams() {
        return new CopyParams();
    }

    /**
     * Create an instance of {@link ShowJob }
     * 
     */
    public ShowJob createShowJob() {
        return new ShowJob();
    }

    /**
     * Create an instance of {@link PluginConfig }
     * 
     */
    public PluginConfig createPluginPluginConfig() {
        return new PluginConfig();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link SubsystemShow }
     * 
     */
    public SubsystemShow createSubsystemShow() {
        return new SubsystemShow();
    }

    /**
     * Create an instance of {@link XmlPayload }
     * 
     */
    public XmlPayload createXmlPayload() {
        return new XmlPayload();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createRunTimeDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link RemoteSchedulerStartRemoteTask }
     * 
     */
    public RemoteSchedulerStartRemoteTask createRemoteSchedulerStartRemoteTask() {
        return new RemoteSchedulerStartRemoteTask();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Ultimos.Day }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Ultimos.Day createUltimosDay() {
        return new af.jstech.migration.jaxb.scheduler.Ultimos.Day();
    }

    /**
     * Create an instance of {@link Plugins }
     * 
     */
    public Plugins createPlugins() {
        return new Plugins();
    }

    /**
     * Create an instance of {@link JobChainModify }
     * 
     */
    public JobChainModify createJobChainModify() {
        return new JobChainModify();
    }

    /**
     * Create an instance of {@link Spooler }
     * 
     */
    public Spooler createSpooler() {
        return new Spooler();
    }

    /**
     * Create an instance of {@link ConfigurationDirectory }
     * 
     */
    public ConfigurationDirectory createConfigurationDirectory() {
        return new ConfigurationDirectory();
    }

    /**
     * Create an instance of {@link ScheduleRemove }
     * 
     */
    public ScheduleRemove createScheduleRemove() {
        return new ScheduleRemove();
    }

    /**
     * Create an instance of {@link ShowJobChain }
     * 
     */
    public ShowJobChain createShowJobChain() {
        return new ShowJobChain();
    }

    /**
     * Create an instance of {@link AllowedHost }
     * 
     */
    public AllowedHost createSecurityAllowedHost() {
        return new AllowedHost();
    }

    /**
     * Create an instance of {@link SchedulerScript }
     * 
     */
    public SchedulerScript createSchedulerScript() {
        return new SchedulerScript();
    }

    /**
     * Create an instance of {@link ShowHistory }
     * 
     */
    public ShowHistory createShowHistory() {
        return new ShowHistory();
    }

    /**
     * Create an instance of {@link JobChainNodeJobChain }
     * 
     */
    public JobChainNodeJobChain createJobChainNodeJobChain() {
        return new JobChainNodeJobChain();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Terminate }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Terminate createTerminate() {
        return new af.jstech.migration.jaxb.scheduler.Terminate();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createJobProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Weekdays.Day }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Weekdays.Day createWeekdaysDay() {
        return new af.jstech.migration.jaxb.scheduler.Weekdays.Day();
    }

    /**
     * Create an instance of {@link SupervisorRemoteSchedulerConfigurationFetchUpdatedFiles }
     * 
     */
    public SupervisorRemoteSchedulerConfigurationFetchUpdatedFiles createSupervisorRemoteSchedulerConfigurationFetchUpdatedFiles() {
        return new SupervisorRemoteSchedulerConfigurationFetchUpdatedFiles();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link ModifyHotFolder }
     * 
     */
    public ModifyHotFolder createModifyHotFolder() {
        return new ModifyHotFolder();
    }

    /**
     * Create an instance of {@link CheckFolders }
     * 
     */
    public CheckFolders createCheckFolders() {
        return new CheckFolders();
    }

    /**
     * Create an instance of {@link Month }
     * 
     */
    public Month createRunTimeMonth() {
        return new Month();
    }

    /**
     * Create an instance of {@link RemoteSchedulerRemoteTaskClose }
     * 
     */
    public RemoteSchedulerRemoteTaskClose createRemoteSchedulerRemoteTaskClose() {
        return new RemoteSchedulerRemoteTaskClose();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createJobDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link ShowOrder }
     * 
     */
    public ShowOrder createShowOrder() {
        return new ShowOrder();
    }

    /**
     * Create an instance of {@link Commands }
     * 
     */
    public Commands createCommands() {
        return new Commands();
    }

    /**
     * Create an instance of {@link RemoveJobChain }
     * 
     */
    public RemoveJobChain createRemoveJobChain() {
        return new RemoveJobChain();
    }

    /**
     * Create an instance of {@link JobWhy }
     * 
     */
    public JobWhy createJobWhy() {
        return new JobWhy();
    }

    /**
     * Create an instance of {@link ERROR }
     * 
     */
    public ERROR createRegisterRemoteSchedulerERROR() {
        return new ERROR();
    }

    /**
     * Create an instance of {@link KillTask }
     * 
     */
    public KillTask createKillTask() {
        return new KillTask();
    }

    /**
     * Create an instance of {@link HttpDirectory }
     * 
     */
    public HttpDirectory createHttpDirectory() {
        return new HttpDirectory();
    }

    /**
     * Create an instance of {@link Weekday }
     * 
     */
    public Weekday createMonthdaysWeekday() {
        return new Weekday();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Holidays.Weekdays.Day }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Holidays.Weekdays.Day createHolidaysWeekdaysDay() {
        return new af.jstech.migration.jaxb.scheduler.Holidays.Weekdays.Day();
    }

    /**
     * Create an instance of {@link ModifyJob }
     * 
     */
    public ModifyJob createModifyJob() {
        return new ModifyJob();
    }

    /**
     * Create an instance of {@link JobSettings }
     * 
     */
    public JobSettings createJobSettings() {
        return new JobSettings();
    }

    /**
     * Create an instance of {@link ProcessClasses }
     * 
     */
    public ProcessClasses createProcessClasses() {
        return new ProcessClasses();
    }

    /**
     * Create an instance of {@link HttpUsers }
     * 
     */
    public HttpUsers createHttpAuthenticationHttpUsers() {
        return new HttpUsers();
    }

    /**
     * Create an instance of {@link JobChain }
     * 
     */
    public JobChain createJobChain() {
        return new JobChain();
    }

    /**
     * Create an instance of {@link Jobs }
     * 
     */
    public Jobs createJobs() {
        return new Jobs();
    }

    /**
     * Create an instance of {@link ShowJobs }
     * 
     */
    public ShowJobs createShowJobs() {
        return new ShowJobs();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createSpoolerConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createEnvironmentVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link Environment }
     * 
     */
    public Environment createEnvironment() {
        return new Environment();
    }

    /**
     * Create an instance of {@link HttpUser }
     * 
     */
    public HttpUser createHttpAuthenticationHttpUsersHttpUser() {
        return new HttpUser();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createSpoolerAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link JobChainNode }
     * 
     */
    public JobChainNode createJobChainJobChainNode() {
        return new JobChainNode();
    }

    /**
     * Create an instance of {@link RunTime }
     * 
     */
    public RunTime createRunTime() {
        return new RunTime();
    }

    /**
     * Create an instance of {@link Base }
     * 
     */
    public Base createSpoolerConfigBase() {
        return new Base();
    }

    /**
     * Create an instance of {@link ConfigurationFile }
     * 
     */
    public ConfigurationFile createConfigurationFile() {
        return new ConfigurationFile();
    }

    /**
     * Create an instance of {@link Monitor }
     * 
     */
    public Monitor createJobMonitor() {
        return new Monitor();
    }

    /**
     * Create an instance of {@link AddJobs }
     * 
     */
    public AddJobs createAddJobs() {
        return new AddJobs();
    }

    /**
     * Create an instance of {@link Locks }
     * 
     */
    public Locks createSpoolerConfigLocks() {
        return new Locks();
    }

    /**
     * Create an instance of {@link Holiday }
     * 
     */
    public Holiday createHoliday() {
        return new Holiday();
    }

    /**
     * Create an instance of {@link RegisterRemoteScheduler }
     * 
     */
    public RegisterRemoteScheduler createRegisterRemoteScheduler() {
        return new RegisterRemoteScheduler();
    }

    /**
     * Create an instance of {@link Payload }
     * 
     */
    public Payload createOrderPayload() {
        return new Payload();
    }

    /**
     * Create an instance of {@link ModifySpooler }
     * 
     */
    public ModifySpooler createModifySpooler() {
        return new ModifySpooler();
    }

    /**
     * Create an instance of {@link LockUse }
     * 
     */
    public LockUse createJobLockUse() {
        return new LockUse();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.ClusterMemberCommand.Terminate }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.ClusterMemberCommand.Terminate createClusterMemberCommandTerminate() {
        return new af.jstech.migration.jaxb.scheduler.ClusterMemberCommand.Terminate();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Holidays.Weekdays }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Holidays.Weekdays createHolidaysWeekdays() {
        return new af.jstech.migration.jaxb.scheduler.Holidays.Weekdays();
    }

    /**
     * Create an instance of {@link DelayOrderAfterSetback }
     * 
     */
    public DelayOrderAfterSetback createJobDelayOrderAfterSetback() {
        return new DelayOrderAfterSetback();
    }

    /**
     * Create an instance of {@link HttpServer }
     * 
     */
    public HttpServer createHttpServer() {
        return new HttpServer();
    }

    /**
     * Create an instance of {@link Job }
     * 
     */
    public Job createJob() {
        return new Job();
    }

    /**
     * Create an instance of {@link Script }
     * 
     */
    public Script createScript() {
        return new Script();
    }

    /**
     * Create an instance of {@link At }
     * 
     */
    public At createRunTimeAt() {
        return new At();
    }

    /**
     * Create an instance of {@link ProcessClassRemove }
     * 
     */
    public ProcessClassRemove createProcessClassRemove() {
        return new ProcessClassRemove();
    }

    /**
     * Create an instance of {@link HttpAuthentication }
     * 
     */
    public HttpAuthentication createHttpAuthentication() {
        return new HttpAuthentication();
    }

    /**
     * Create an instance of {@link Ultimos }
     * 
     */
    public Ultimos createUltimos() {
        return new Ultimos();
    }

    /**
     * Create an instance of {@link LicenceUse }
     * 
     */
    public LicenceUse createLicenceUse() {
        return new LicenceUse();
    }

    /**
     * Create an instance of {@link ParamGet }
     * 
     */
    public ParamGet createParamGet() {
        return new ParamGet();
    }

    /**
     * Create an instance of {@link LockRemove }
     * 
     */
    public LockRemove createLockRemove() {
        return new LockRemove();
    }

    /**
     * Create an instance of {@link ClusterMemberCommand }
     * 
     */
    public ClusterMemberCommand createClusterMemberCommand() {
        return new ClusterMemberCommand();
    }

    /**
     * Create an instance of {@link FileOrderSink }
     * 
     */
    public FileOrderSink createJobChainFileOrderSink() {
        return new FileOrderSink();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link ShowState }
     * 
     */
    public ShowState createShowState() {
        return new ShowState();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Monthdays.Day }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Monthdays.Day createMonthdaysDay() {
        return new af.jstech.migration.jaxb.scheduler.Monthdays.Day();
    }

    /**
     * Create an instance of {@link StartJob }
     * 
     */
    public StartJob createStartJob() {
        return new StartJob();
    }

    /**
     * Create an instance of {@link DelayAfterError }
     * 
     */
    public DelayAfterError createJobDelayAfterError() {
        return new DelayAfterError();
    }

    /**
     * Create an instance of {@link StartWhenDirectoryChanged }
     * 
     */
    public StartWhenDirectoryChanged createJobStartWhenDirectoryChanged() {
        return new StartWhenDirectoryChanged();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link RemoveOrder }
     * 
     */
    public RemoveOrder createRemoveOrder() {
        return new RemoveOrder();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Include }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Include createInclude() {
        return new af.jstech.migration.jaxb.scheduler.Include();
    }

    /**
     * Create an instance of {@link ModifyOrder }
     * 
     */
    public ModifyOrder createModifyOrder() {
        return new ModifyOrder();
    }

    /**
     * Create an instance of {@link ShowJobChains }
     * 
     */
    public ShowJobChains createShowJobChains() {
        return new ShowJobChains();
    }

    /**
     * Create an instance of {@link WebService }
     * 
     */
    public WebService createWebService() {
        return new WebService();
    }

    /**
     * Create an instance of {@link SchedulerLogLogCategoriesSet }
     * 
     */
    public SchedulerLogLogCategoriesSet createSchedulerLogLogCategoriesSet() {
        return new SchedulerLogLogCategoriesSet();
    }

    /**
     * Create an instance of {@link WebServices }
     * 
     */
    public WebServices createWebServices() {
        return new WebServices();
    }

    /**
     * Create an instance of {@link ShowTask }
     * 
     */
    public ShowTask createShowTask() {
        return new ShowTask();
    }

    /**
     * Create an instance of {@link ProcessClass }
     * 
     */
    public ProcessClass createProcessClass() {
        return new ProcessClass();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Weekdays }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Weekdays createWeekdays() {
        return new af.jstech.migration.jaxb.scheduler.Weekdays();
    }

    /**
     * Create an instance of {@link PluginCommand }
     * 
     */
    public PluginCommand createPluginCommand() {
        return new PluginCommand();
    }

    /**
     * Create an instance of {@link EventsGet }
     * 
     */
    public EventsGet createEventsGet() {
        return new EventsGet();
    }

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link Params }
     * 
     */
    public Params createParams() {
        return new Params();
    }

    /**
     * Create an instance of {@link ShowCalendar }
     * 
     */
    public ShowCalendar createShowCalendar() {
        return new ShowCalendar();
    }

    /**
     * Create an instance of {@link af.jstech.migration.jaxb.scheduler.Params.Include }
     * 
     */
    public af.jstech.migration.jaxb.scheduler.Params.Include createParamsInclude() {
        return new af.jstech.migration.jaxb.scheduler.Params.Include();
    }

    /**
     * Create an instance of {@link Lock }
     * 
     */
    public Lock createLock() {
        return new Lock();
    }

    /**
     * Create an instance of {@link JobChainNodeEnd }
     * 
     */
    public JobChainNodeEnd createJobChainNodeEnd() {
        return new JobChainNodeEnd();
    }

    /**
     * Create an instance of {@link JobChains }
     * 
     */
    public JobChains createJobChains() {
        return new JobChains();
    }

    /**
     * Create an instance of {@link Cluster }
     * 
     */
    public Cluster createCluster() {
        return new Cluster();
    }

    /**
     * Create an instance of {@link FileOrderSource }
     * 
     */
    public FileOrderSource createJobChainFileOrderSource() {
        return new FileOrderSource();
    }

    /**
     * Create an instance of {@link Plugin }
     * 
     */
    public Plugin createPlugin() {
        return new Plugin();
    }

    /**
     * Create an instance of {@link Holidays }
     * 
     */
    public Holidays createHolidays() {
        return new Holidays();
    }

    /**
     * Create an instance of {@link JobChainNodeModify }
     * 
     */
    public JobChainNodeModify createJobChainNodeModify() {
        return new JobChainNodeModify();
    }

    /**
     * Create an instance of {@link SchedulerLogLogCategoriesReset }
     * 
     */
    public SchedulerLogLogCategoriesReset createSchedulerLogLogCategoriesReset() {
        return new SchedulerLogLogCategoriesReset();
    }

    /**
     * Create an instance of {@link Schedules }
     * 
     */
    public Schedules createSpoolerConfigSchedules() {
        return new Schedules();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "show_state")
    public JAXBElement<ShowState> createShowState(ShowState value) {
        return new JAXBElement<ShowState>(_ShowState_QNAME, ShowState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleRemove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "schedule.remove")
    public JAXBElement<ScheduleRemove> createScheduleRemove(ScheduleRemove value) {
        return new JAXBElement<ScheduleRemove>(_ScheduleRemove_QNAME, ScheduleRemove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFolders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "check_folders")
    public JAXBElement<CheckFolders> createCheckFolders(CheckFolders value) {
        return new JAXBElement<CheckFolders>(_CheckFolders_QNAME, CheckFolders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubsystemShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subsystem.show")
    public JAXBElement<SubsystemShow> createSubsystemShow(SubsystemShow value) {
        return new JAXBElement<SubsystemShow>(_SubsystemShow_QNAME, SubsystemShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "scheduler_log.log_categories.show")
    public JAXBElement<Object> createSchedulerLogLogCategoriesShow(Object value) {
        return new JAXBElement<Object>(_SchedulerLogLogCategoriesShow_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commands }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "commands")
    public JAXBElement<Commands> createCommands(Commands value) {
        return new JAXBElement<Commands>(_Commands_QNAME, Commands.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock")
    public JAXBElement<Lock> createLock(Lock value) {
        return new JAXBElement<Lock>(_Lock_QNAME, Lock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "params.get")
    public JAXBElement<Object> createParamsGet(Object value) {
        return new JAXBElement<Object>(_ParamsGet_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "add_order")
    public JAXBElement<Order> createAddOrder(Order value) {
        return new JAXBElement<Order>(_AddOrder_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockRemove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock.remove")
    public JAXBElement<LockRemove> createLockRemove(LockRemove value) {
        return new JAXBElement<LockRemove>(_LockRemove_QNAME, LockRemove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "schedule")
    public JAXBElement<RunTime> createSchedule(RunTime value) {
        return new JAXBElement<RunTime>(_Schedule_QNAME, RunTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "s")
    public JAXBElement<ShowState> createS(ShowState value) {
        return new JAXBElement<ShowState>(_S_QNAME, ShowState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process_class")
    public JAXBElement<ProcessClass> createProcessClass(ProcessClass value) {
        return new JAXBElement<ProcessClass>(_ProcessClass_QNAME, ProcessClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "show_schedulers")
    public JAXBElement<ShowState> createShowSchedulers(ShowState value) {
        return new JAXBElement<ShowState>(_ShowSchedulers_QNAME, ShowState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyHotFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modify_hot_folder")
    public JAXBElement<ModifyHotFolder> createModifyHotFolder(ModifyHotFolder value) {
        return new JAXBElement<ModifyHotFolder>(_ModifyHotFolder_QNAME, ModifyHotFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessClassRemove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process_class.remove")
    public JAXBElement<ProcessClassRemove> createProcessClassRemove(ProcessClassRemove value) {
        return new JAXBElement<ProcessClassRemove>(_ProcessClassRemove_QNAME, ProcessClassRemove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "run_time")
    public JAXBElement<RunTime> createRunTime(RunTime value) {
        return new JAXBElement<RunTime>(_RunTime_QNAME, RunTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockRemove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock.remove", scope = Commands.class)
    public JAXBElement<LockRemove> createCommandsLockRemove(LockRemove value) {
        return new JAXBElement<LockRemove>(_LockRemove_QNAME, LockRemove.class, Commands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFolders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "check_folders", scope = Commands.class)
    public JAXBElement<CheckFolders> createCommandsCheckFolders(CheckFolders value) {
        return new JAXBElement<CheckFolders>(_CheckFolders_QNAME, CheckFolders.class, Commands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "order", scope = Commands.class)
    public JAXBElement<Order> createCommandsOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, Commands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process_class", scope = Commands.class)
    public JAXBElement<ProcessClass> createCommandsProcessClass(ProcessClass value) {
        return new JAXBElement<ProcessClass>(_ProcessClass_QNAME, ProcessClass.class, Commands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lock", scope = Commands.class)
    public JAXBElement<Lock> createCommandsLock(Lock value) {
        return new JAXBElement<Lock>(_Lock_QNAME, Lock.class, Commands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessClassRemove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process_class.remove", scope = Commands.class)
    public JAXBElement<ProcessClassRemove> createCommandsProcessClassRemove(ProcessClassRemove value) {
        return new JAXBElement<ProcessClassRemove>(_ProcessClassRemove_QNAME, ProcessClassRemove.class, Commands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "run_time", scope = Commands.class)
    public JAXBElement<RunTime> createCommandsRunTime(RunTime value) {
        return new JAXBElement<RunTime>(_RunTime_QNAME, RunTime.class, Commands.class, value);
    }

}