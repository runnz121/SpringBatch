CREAtE TABLE `postDate`
(
      `id`                  BIGINT          NOT NULL AUTO_INCREMENT
    , `rowNumber`           Long            NOT NULL
    , `openServiceId`       VARCHAR(255)    NOT NULL
    , `code`                VARCHAR(255)    NOT NULL
    , `controlNum`          VARCHAR(255)    NOT NULL
    , `shopName`            VARCHAR(255)
    , `allowNumber`         VARCHAR(255)
    , `streetAddress`       VARCHAR(255)
    , `locationAddress`     VARCHAR(255)
    , `operationCode`       VARCHAR(255)
    , `closedDate`          VARCHAR(255)
    , `regDate`             VARCHAR(255)
    , `openDate`            VARCHAR(255)
    , `designateDate`       VARCHAR(255)
    , `cancelRegDate`       VARCHAR(255)
    , `cancelReason`        VARCHAR(255)
    , `unAvailableDate`     VARCHAR(255)
    , `unAvailableReason`   VARCHAR(255)
    , `foodSort`            VARCHAR(255)
    , `reDesignateDate`     VARCHAR(255)
    , `lastModifiedDate`    VARCHAR(255)
    , `renewedSort`         VARCHAR(255)
    , `renewedDate`         VARCHAR(255)
    , `phoneNumber`         VARCHAR(255)
    ,
    PRIMARY KEY (`id`)
)   DEFAULT CHARSET = UTF8MB4;