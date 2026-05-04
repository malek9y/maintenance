# UniTime – University Timetabling System
## Software Maintenance & Evolution 

---

## Team Members


| Youssef Hamed   | Password Strength Validator |

| Malek Taha      | Room Capacity Validation Bug Fix |

| Andrew Nabil    | Email Notification on Conflict |

| Bassel Abdo     | Audit Logging for Timetable Changes |
---

## Project Description
UniTime is an open-source Java-based university scheduling system that supports
course timetabling, exam scheduling, student enrollment, room management,
and event booking. This repository contains our maintenance changes as part
of the Software Evolution course.

---

## Technology Stack
- Java 17
- Spring Framework
- Hibernate ORM
- Apache Tomcat / WildFly
- MySQL / PostgreSQL
- GWT (Google Web Toolkit)

---

## Change Requests


| CR-001 | New Feature | Password Strength Validator               | Youssef Hamed | In Progress |

| CR-002 | Bug Fix | Room Capacity vs Class Limit Validation       | Malek Taha    | In Progress |

| CR-003 | New Feature | Email Notification on Scheduling Conflict | Andrew Nabil  | Open |

| CR-004 | New Feature | Audit Logging for Timetable Changes       | Bassel Abdo   | open |
---

## Ticketing System
Change requests are tracked on jira [ https://unitime-maintenance.atlassian.net/jira/software/projects/SCRUM/boards/1?atlOrigin=eyJpIjoiNzA1Nzk5NmFhYzE1NDM2YThmOTIyM2JmMzgwOWFiYzIiLCJwIjoiaiJ9 ].

---

## How to Build
mvn clean install
