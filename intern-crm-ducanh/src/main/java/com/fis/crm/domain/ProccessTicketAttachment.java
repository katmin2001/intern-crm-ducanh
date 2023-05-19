package com.fis.crm.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

/**
 * A TicketRequest.
 */
@Entity
@Table(name = "process_ticket_attachment")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ProccessTicketAttachment implements Serializable {

  private static final long serialVersionUID = 1L;


  @Id
  @Column(name = "process_ticket_attachment_id", unique = true, nullable = false)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROCESS_TICKET_SEQ_GEN")
  @SequenceGenerator(name = "PROCESS_TICKET_SEQ_GEN", sequenceName = "PROCESS_TICKET_SEQ", allocationSize = 1)
  private Long processTicketAttachmentId;



  @Column(name = "ticket_request_id")
  private Long ticketRequestId;

  @Column(name = "file_name")
  private String fileName;

  @Column(name = "fill_name_encrypt")
  private String fillNameEncrypt;

  @Column(name = "create_datetime")
  private Instant createDatetime;

  @Column(name = "create_user")
  private Long createUser;

  @Column(name = "status")
  private String status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getProcessTicketAttachmentId() {
        return processTicketAttachmentId;
    }

    public void setProcessTicketAttachmentId(Long processTicketAttachmentId) {
        this.processTicketAttachmentId = processTicketAttachmentId;
    }

    public Long getTicketRequestId() {
        return ticketRequestId;
    }

    public void setTicketRequestId(Long ticketRequestId) {
        this.ticketRequestId = ticketRequestId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFillNameEncrypt() {
        return fillNameEncrypt;
    }

    public void setFillNameEncrypt(String fillNameEncrypt) {
        this.fillNameEncrypt = fillNameEncrypt;
    }

    public Instant getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Instant createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ProccessTicketAttachment)) {
      return false;
    }
    return processTicketAttachmentId != null && processTicketAttachmentId.equals(((ProccessTicketAttachment) o).processTicketAttachmentId);
  }

  @Override
  public int hashCode() {
    // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
    return getClass().hashCode();
  }

  // prettier-ignore
    @Override
    public String toString() {
        return "ProcessTicketAttachment{" +
            " processTicketAttachmentId=" + getProcessTicketAttachmentId() +
            ", ticketRequestId=" + getTicketRequestId() +
            ", fileName='" + getFileName() + "'" +
            ", fillNameEncrypt='" + getFillNameEncrypt() + "'" +
            ", createDatetime=" + getCreateDatetime() +
            ", createUser=" + getCreateUser() +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
