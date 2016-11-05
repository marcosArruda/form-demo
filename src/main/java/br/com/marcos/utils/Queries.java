package br.com.marcos.utils;

/**
 * Created by marcos on 24/10/16.
 */
public enum Queries {
    CREATE_TABLES("CREATE TABLE REGION " +
            "( " +
            " REGION_ID INT PRIMARY KEY         NOT NULL," +
            " REGION_NAME           CHAR(10)    NOT NULL, " +
            " REGION_DATE_UPDATED   TEXT        NOT NULL, " +
            " REGION_DATE_ADDDED    TEXT        NOT NULL " +
            "); " +
            " " +

            "CREATE TABLE OFFICE " +
            "( " +
            " OFFICE_ID INT PRIMARY KEY     NOT NULL," +
            " REGION_ID             INT     NOT NULL, " +
            " OFFICE_NAME           TEXT    NOT NULL," +
            " OFFICE_DATE_UPDATED   TEXT    NOT NULL, " +
            " OFFICE_DATE_ADDDED    TEXT    NOT NULL, " +
            " FOREIGN KEY(REGION_ID) REFERENCES REGION(REGION_ID) " +
            "); " +
            " " +

            "CREATE TABLE SERVICE " +
            "(" +
            " SERVICE_ID INT PRIMARY KEY          NOT NULL," +
            " OFFICE_ID              INT          NOT NULL, " +
            " SERVICE_NAME           CHAR(100)    NOT NULL, " +
            " SERVICE_DATE_UPDATED   TEXT         NOT NULL, " +
            " SERVICE_DATE_ADDDED    TEXT         NOT NULL, " +
            " STATUS                 TEXT         NOT NULL, " +
            " FOREIGN KEY(OFFICE_ID) REFERENCES OFFICE(OFFICE_ID) " +
            "); " +
            " " +

            "CREATE TABLE DASHBOARD " +
            "( " +
            " DASHBOARD_ID INT PRIMARY KEY     NOT NULL," +
            " SERVICE_ID               INT     NOT NULL, " +
            " DASHBOARD_STATUS         CHAR(1) NOT NULL, " +
            " DASHBOARD_DATE_UPDATED   TEXT    NOT NULL, " +
            " DASHBOARD_DATE_ADDDED    TEXT    NOT NULL, " +
            " FOREIGN KEY(SERVICE_ID) REFERENCES SERVICE(SERVICE_ID) " +
            "); "
    ),
    DROP_ALL_TABLES("DROP TABLE IF EXISTS 'DASHBOARD'; " +
            " DROP TABLE IF EXISTS 'SERVICE'; " +
            " DROP TABLE IF EXISTS 'OFFICE'; " +
            " DROP TABLE IF EXISTS 'REGION'; "
    ),
    INSERT_BASIC_DATA(  " INSERT INTO REGION VALUES (1, 'LATAM', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO REGION VALUES (2, 'EAST', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +

            " INSERT INTO OFFICE VALUES (1, 1, 'BUE', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (2, 1, 'SAO', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (3, 1, 'BRA', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (4, 1, 'MEX', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (5, 1, 'BOG', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (6, 1, 'MIA', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (7, 2, 'FRC', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (8, 2, 'ATN', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (9, 2, 'CHI', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +
            " INSERT INTO OFFICE VALUES (10, 2, 'BIR', DATETIME('now', 'localtime'), DATETIME('now', 'localtime')); " +





            " INSERT INTO SERVICE VALUES (1, 1, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (2, 1, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (3, 1, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (4, 1, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (5, 1, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (6, 1, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (7, 1, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (8, 1, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (9, 1, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (10, 1, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (11, 1, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (12, 1, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (13, 1, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (14, 2, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (15, 2, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (16, 2, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (17, 2, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (18, 2, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (19, 2, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (20, 2, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (21, 2, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (22, 2, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (23, 2, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (24, 2, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (25, 2, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (26, 2, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (27, 3, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (28, 3, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (29, 3, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (30, 3, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (31, 3, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (32, 3, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (33, 3, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (34, 3, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (35, 3, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (36, 3, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (37, 3, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (38, 3, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (39, 3, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (40, 4, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (41, 4, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (42, 4, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (43, 4, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (44, 4, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (45, 4, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (46, 4, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (47, 4, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (48, 4, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (49, 4, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (50, 4, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (51, 4, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (52, 4, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (53, 5, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (54, 5, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (55, 5, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (56, 5, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (57, 5, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (58, 5, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (59, 5, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (60, 5, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (61, 5, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (62, 5, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (63, 5, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (64, 5, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (65, 5, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (66, 6, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (67, 6, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (68, 6, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (69, 6, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (70, 6, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (71, 6, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (72, 6, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (73, 6, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (74, 6, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (75, 6, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (76, 6, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (78, 6, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (79, 6, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (80, 7, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (81, 7, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (82, 7, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (83, 7, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (84, 7, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (85, 7, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (86, 7, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (87, 7, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (88, 7, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (89, 7, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (90, 7, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (91, 7, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (92, 7, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (93, 8, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (94, 8, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (95, 8, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (96, 8, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (97, 8, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (98, 8, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (99, 8, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (100, 8, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (101, 8, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (102, 8, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (103, 8, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (104, 8, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (105, 8, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (106, 9, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (107, 9, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (108, 9, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (109, 9, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (110, 9, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (111, 9, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (112, 9, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (113, 9, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (114, 9, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (115, 9, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (116, 9, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (117, 9, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (118, 9, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " INSERT INTO SERVICE VALUES (119, 10, 'service 1', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (120, 10, 'service 2', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (121, 10, 'service 3', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (122, 10, 'service 4', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (123, 10, 'service 5', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (124, 10, 'service 6', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (125, 10, 'service 7', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (126, 10, 'service 8', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (127, 10, 'service 9', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (128, 10, 'service 10', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (129, 10, 'service 11', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (130, 10, 'service 12', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +
            " INSERT INTO SERVICE VALUES (131, 10, 'service 13', DATETIME('now', 'localtime'), DATETIME('now', 'localtime'), 'others'); " +

            " "),

    GET_ALL_OFFICES("SELECT OFFICE_ID, OFFICE_NAME FROM OFFICE;"),
    GET_SERVICE_NAMES_ONLY("SELECT DISTICT SERVICE_NAME FROM SERVICE;"),
    GET_SERVICE_BY_OFFICE("SELECT SERVICE_ID, OFFICE_ID, SERVICE_NAME, STATUS FROM SERVICE WHERE OFFICE_ID = ");
    //FOREIGN KEY(trackartist) REFERENCES artist(artistid)
    //"YYYY-MM-DD HH:MM:SS"

    private String value;
    private Queries(String value){
        setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
